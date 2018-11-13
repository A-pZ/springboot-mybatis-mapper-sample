/**
 *
 */
package com.github.apz.springsample.domain.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.github.apz.springsample.domain.model.FoodCode;

/**
 * @author a-pz
 *
 */
public class FoodCodeTypeHandler implements TypeHandler<FoodCode> {

	public void setParameter(PreparedStatement ps, int i, FoodCode parameter, JdbcType jdbcType) throws SQLException {
		// TODO 自動生成されたメソッド・スタブ

	}

	public FoodCode getResult(ResultSet rs, String columnName) throws SQLException {
		return new FoodCode(rs.getInt(columnName));
	}

	public FoodCode getResult(ResultSet rs, int columnIndex) throws SQLException {
		return new FoodCode(rs.getInt(columnIndex));
	}

	public FoodCode getResult(CallableStatement cs, int columnIndex) throws SQLException {
		return new FoodCode(cs.getInt(columnIndex));
	}

}
