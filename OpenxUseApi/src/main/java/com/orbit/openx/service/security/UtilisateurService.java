package com.orbit.openx.service.security;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService extends JdbcDaoImpl {

	public UtilisateurService() {
		super();
		setUsersByUsernameQuery("select user_id, username, password, active, contact_name from ox_users where username=?");
		setAuthoritiesByUsernameQuery("select u.username, ur.account_type from ox_users u, ox_accounts ur where u.default_account_id = ur.account_id and u.username =?");

	}

	@Override
	public List<UserDetails> loadUsersByUsername(String username) {
		return getJdbcTemplate().query(getUsersByUsernameQuery(), new String[] { username }, new RowMapper<UserDetails>() {

			public Utilisateur mapRow(ResultSet rs, int rowNum) throws SQLException {
				int id = rs.getInt(1);
				String login = rs.getString(2);
				String password = rs.getString(3);
				boolean enabled = rs.getBoolean(4);
				String nom = rs.getString(5);
				return new Utilisateur(id, login, password, enabled, nom, true, true, true, AuthorityUtils.NO_AUTHORITIES);
			}
		});
	}

	@Autowired
	protected void setDataSrc(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	protected UserDetails createUserDetails(String username, UserDetails userFromUserQuery, List<GrantedAuthority> combinedAuthorities) {
		String returnUsername = userFromUserQuery.getUsername();
		Utilisateur userDetail = (Utilisateur) userFromUserQuery;

		if (!isUsernameBasedPrimaryKey()) {
			returnUsername = username;
		}

		return new Utilisateur(userDetail.getId(), returnUsername, userDetail.getPassword(), userDetail.isEnabled(), userDetail.getNom(), true, true, true, combinedAuthorities);

	}
}
