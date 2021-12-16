package com.example.exes.mybatis.mapper;

import static com.example.exes.mybatis.mapper.MovieDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.annotation.Generated;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

import com.example.exes.mybatis.domain.Movie;

@Mapper
public interface MovieMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source Table: movie")
	BasicColumn[] selectList = BasicColumn.columnList(id, image_url, title, info, movie_url, channel_name);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source Table: movie")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source Table: movie")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source Table: movie")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Movie> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source Table: movie")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Movie> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source Table: movie")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("MovieResult")
	Optional<Movie> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source Table: movie")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "MovieResult", value = { @Result(column = "id", property = "id", jdbcType = JdbcType.CHAR, id = true),
			@Result(column = "image_url", property = "image_url", jdbcType = JdbcType.VARCHAR),
			@Result(column = "title", property = "title", jdbcType = JdbcType.VARCHAR),
			@Result(column = "info", property = "info", jdbcType = JdbcType.VARCHAR),
			@Result(column = "movie_url", property = "movie_url", jdbcType = JdbcType.VARCHAR),
			@Result(column = "channel_name", property = "channel_name", jdbcType = JdbcType.VARCHAR) })
	List<Movie> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source Table: movie")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source Table: movie")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, movie, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source Table: movie")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, movie, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source Table: movie")
	default int deleteByPrimaryKey(String id_) {
		return delete(c -> c.where(id, isEqualTo(id_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source Table: movie")
	default int insert(Movie record) {
		return MyBatis3Utils.insert(this::insert, record, movie,
				c -> c.map(id).toProperty("id").map(image_url).toProperty("image_url").map(title).toProperty("title")
						.map(info).toProperty("info").map(movie_url).toProperty("movie_url").map(channel_name)
						.toProperty("channel_name"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source Table: movie")
	default int insertMultiple(Collection<Movie> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, movie,
				c -> c.map(id).toProperty("id").map(image_url).toProperty("image_url").map(title).toProperty("title")
						.map(info).toProperty("info").map(movie_url).toProperty("movie_url").map(channel_name)
						.toProperty("channel_name"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source Table: movie")
	default int insertSelective(Movie record) {
		return MyBatis3Utils.insert(this::insert, record, movie,
				c -> c.map(id).toPropertyWhenPresent("id", record::getId).map(image_url)
						.toPropertyWhenPresent("image_url", record::getImage_url).map(title)
						.toPropertyWhenPresent("title", record::getTitle).map(info)
						.toPropertyWhenPresent("info", record::getInfo).map(movie_url)
						.toPropertyWhenPresent("movie_url", record::getMovie_url).map(channel_name)
						.toPropertyWhenPresent("channel_name", record::getChannel_name));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1571469+09:00", comments = "Source Table: movie")
	default Optional<Movie> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, movie, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1571469+09:00", comments = "Source Table: movie")
	default List<Movie> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, movie, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1571469+09:00", comments = "Source Table: movie")
	default List<Movie> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, movie, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1571469+09:00", comments = "Source Table: movie")
	default Optional<Movie> selectByPrimaryKey(String id_) {
		return selectOne(c -> c.where(id, isEqualTo(id_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1571469+09:00", comments = "Source Table: movie")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, movie, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1571469+09:00", comments = "Source Table: movie")
	static UpdateDSL<UpdateModel> updateAllColumns(Movie record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(id).equalTo(record::getId).set(image_url).equalTo(record::getImage_url).set(title)
				.equalTo(record::getTitle).set(info).equalTo(record::getInfo).set(movie_url)
				.equalTo(record::getMovie_url).set(channel_name).equalTo(record::getChannel_name);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1571469+09:00", comments = "Source Table: movie")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Movie record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(id).equalToWhenPresent(record::getId).set(image_url).equalToWhenPresent(record::getImage_url)
				.set(title).equalToWhenPresent(record::getTitle).set(info).equalToWhenPresent(record::getInfo)
				.set(movie_url).equalToWhenPresent(record::getMovie_url).set(channel_name)
				.equalToWhenPresent(record::getChannel_name);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1571469+09:00", comments = "Source Table: movie")
	default int updateByPrimaryKey(Movie record) {
		return update(c -> c.set(image_url).equalTo(record::getImage_url).set(title).equalTo(record::getTitle).set(info)
				.equalTo(record::getInfo).set(movie_url).equalTo(record::getMovie_url).set(channel_name)
				.equalTo(record::getChannel_name).where(id, isEqualTo(record::getId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1571469+09:00", comments = "Source Table: movie")
	default int updateByPrimaryKeySelective(Movie record) {
		return update(c -> c.set(image_url).equalToWhenPresent(record::getImage_url).set(title)
				.equalToWhenPresent(record::getTitle).set(info).equalToWhenPresent(record::getInfo).set(movie_url)
				.equalToWhenPresent(record::getMovie_url).set(channel_name).equalToWhenPresent(record::getChannel_name)
				.where(id, isEqualTo(record::getId)));
	}
}