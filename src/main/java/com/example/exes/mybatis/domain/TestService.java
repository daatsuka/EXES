package com.example.exes.mybatis.domain;

import static com.example.exes.mybatis.mapper.MovieDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.mybatis.dynamic.sql.render.RenderingStrategies.*;

import java.util.List;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exes.mybatis.mapper.MovieMapper;
@Service
public class TestService {

	@Autowired
	MovieMapper movieMapper;

	public List<com.example.exes.mybatis.domain.Movie> findAll() {
		SelectStatementProvider select = select(movie.id, movie.image_url, movie.title, movie.info, movie.movie_url,
				movie.channel_name).from(movie).build().render(MYBATIS3);
		return movieMapper.selectMany(select);
	}
}