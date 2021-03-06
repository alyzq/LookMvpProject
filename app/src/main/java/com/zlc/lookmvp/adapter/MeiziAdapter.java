package com.zlc.lookmvp.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.zlc.lookmvp.R;
import com.zlc.lookmvp.adapter.common.CommonRecyclerViewAdapter;
import com.zlc.lookmvp.adapter.common.CommonRecyclerViewHolder;
import com.zlc.lookmvp.bean.meizi.MeiziInfo;
import com.zlc.lookmvp.util.DensityUtil;
import com.zlc.lookmvp.util.ImageUtil;
import com.zlc.lookmvp.util.ScreenUtil;

import java.util.List;

/**
 * Created by zlc on 2017/2/8.
 * 妹子数据适配器
 */
public class MeiziAdapter extends CommonRecyclerViewAdapter<MeiziInfo.MeiziBean> {


    public MeiziAdapter(Context context, List<MeiziInfo.MeiziBean> datas) {
        super(context, datas);
    }

    @Override
    public View initView() {
        mView = View.inflate(mContext, R.layout.recycle_meizi_item,null);
        return mView;
    }

    @Override
    public void setData(CommonRecyclerViewHolder holder, int position) {
        MeiziInfo.MeiziBean meizi = mDatas.get(holder.getAdapterPosition());
        if(holder!=null){
            ImageView id_iv_meizi = holder.getView(R.id.id_iv_meizi);
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) id_iv_meizi.getLayoutParams();
            int w = params.width = ScreenUtil.getScreenWidth(mContext) - DensityUtil.dip2px(mContext,10);
            params.height = (w * 9) / 12;
            id_iv_meizi.setLayoutParams(params);
            ImageUtil.showRoundedImage(id_iv_meizi,meizi.url);
        }
    }



}
