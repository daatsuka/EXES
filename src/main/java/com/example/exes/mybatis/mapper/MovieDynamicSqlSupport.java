package com.example.exes.mybatis.mapper;

import java.sql.JDBCType;

import javax.annotation.Generated;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MovieDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1551494+09:00", comments = "Source Table: movie")
	public static final Movie movie = new Movie();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source field: movie.id")
	public static final SqlColumn<String> id = movie.id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source field: movie.image_url")
	public static final SqlColumn<String> image_url = movie.image_url;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source field: movie.title")
	public static final SqlColumn<String> title = movie.title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source field: movie.info")
	public static final SqlColumn<String> info = movie.info;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source field: movie.movie_url")
	public static final SqlColumn<String> movie_url = movie.movie_url;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source field: movie.channel_name")
	public static final SqlColumn<String> channel_name = movie.channel_name;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-12-09T22:01:59.1561865+09:00", comments = "Source Table: movie")
	public static final class Movie extends SqlTable {
		public final SqlColumn<String> id = column("id", JDBCType.CHAR);
		public final SqlColumn<String> image_url = column("image_url", JDBCType.VARCHAR);
		public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);
		public final SqlColumn<String> info = column("info", JDBCType.VARCHAR);
		public final SqlColumn<String> movie_url = column("movie_url", JDBCType.VARCHAR);
		public final SqlColumn<String> channel_name = column("channel_name", JDBCType.VARCHAR);

		public Movie() {
			super("movie");
		}
	}
}