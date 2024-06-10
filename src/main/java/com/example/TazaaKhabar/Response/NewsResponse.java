package com.example.TazaaKhabar.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NewsResponse {
    String status;
    List<ArticleResponse> articles;

}
