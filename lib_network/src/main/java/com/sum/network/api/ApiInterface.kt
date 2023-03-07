package com.sum.network.api

import com.sum.common.model.Banner
import com.sum.network.response.BaseResponse
import com.sum.network.model.ProjectTabItem
import retrofit2.http.GET

/**
 * @author mingyan.su
 * @date   2023/2/27 19:07
 * @desc   API接口类
 */
interface ApiInterface {
    /**
     * 首页轮播图
     */
    @GET("/banner/json")
    suspend fun getHomeBanner(): BaseResponse<MutableList<Banner>>?

    @GET("/project/tree/json")
    suspend fun getTabData(): BaseResponse<MutableList<ProjectTabItem>>?
}