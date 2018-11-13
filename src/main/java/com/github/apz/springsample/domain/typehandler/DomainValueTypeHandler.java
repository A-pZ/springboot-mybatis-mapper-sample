package com.github.apz.springsample.domain.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.github.apz.springsample.domain.model.DomainValue;

public class DomainValueTypeHandler<T extends DomainValue, U> implements TypeHandler<T> {

	@SuppressWarnings("unchecked")
	private Class<?> type;

	@Override
	public void setParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType)
			throws SQLException {
	}

	@Override
	public T getResult(ResultSet rs, String columnName) throws SQLException {
		T domainValue = (T)new DomainValue();
		domainValue.setValue((U)rs.getObject(columnName));
		return domainValue;
	}

	@Override
	public T getResult(ResultSet rs, int columnIndex) throws SQLException {
		T domainValue = (T) new DomainValue();
		domainValue.setValue((U)rs.getObject(columnIndex));
		return domainValue;
	}

	@Override
	public T getResult(CallableStatement cs, int columnIndex) throws SQLException {
		T domainValue = (T) new DomainValue();
		domainValue.setValue((U)cs.getObject(columnIndex));
		return domainValue;
	}

}
