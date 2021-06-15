package com.v1ok.dictionary.client;

import com.v1ok.dictionary.db.model.IndustryEntity;
import com.v1ok.feign.Response;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "dictionary", contextId = "IIndustryService")
public interface IIndustryService {


  @GetMapping("industry/{parentCode}")
  Response<List<IndustryEntity>> list(@PathVariable("parentCode") String parentCode);

  @GetMapping("industry")
  Response<IndustryEntity> findOne(@RequestParam("code") String code);
}
