package com.ahmetyasin.demogetir.controller;

import com.ahmetyasin.demogetir.entity.dto.OrderDTO;
import com.ahmetyasin.demogetir.entity.dto.StatisticDto;
import com.ahmetyasin.demogetir.service.Impl.OrderServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/statistic")
@Api(value = "Statistic API")
public class StatisticController {
    @Autowired
    OrderServiceImpl orderService;


    @GetMapping("/{id}")
    @ApiOperation(value = "Statistic",notes = "Statistic list RestApi")
    public ResponseEntity<List<StatisticDto>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(orderService.monthlyStatistic(id));
    }

}
