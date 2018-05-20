package com.example.zhouliulianxi.net;





import com.example.zhouliulianxi.bean.GetCartsBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface GetCartApiService {
    @FormUrlEncoded
    @POST("product/getCarts")
    Observable<GetCartsBean> getCart(@Field("Uid") String uid,
                                     @Field("Token") String token);

}
