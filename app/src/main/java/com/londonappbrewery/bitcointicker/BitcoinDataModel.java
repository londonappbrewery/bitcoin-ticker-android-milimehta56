package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {

    private String mAsk;

    public static BitcoinDataModel fromJson(JSONObject jsonObject) {
        try {
            BitcoinDataModel bitcoinDataModel = new BitcoinDataModel();
            bitcoinDataModel.mAsk = jsonObject.getString("ask");
            return bitcoinDataModel;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getAsk() {
        return mAsk;
    }
}
