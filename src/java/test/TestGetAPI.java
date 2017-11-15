package test;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.user.tracking.FollowUsers;

public class TestGetAPI {

//    public static void main(String[] args) throws ClientProtocolException, IOException, JSONException {
//        HttpGet httpGet = new HttpGet("http://localhost:3000/api/follow-users");
//
//        try (CloseableHttpClient httpClient = HttpClients.createDefault();
//                CloseableHttpResponse response = httpClient.execute(httpGet);) {
//            HttpEntity entity = response.getEntity();
//            JSONArray listFollowUser = new JSONArray(EntityUtils.toString(entity));
//            Gson gson = new Gson();
//            List<FollowUsers> list = new ArrayList();
//
//            int jsonLength = listFollowUser.length();
//            for (int i = 0; i < jsonLength; i++) {
//                JSONObject jo = listFollowUser.getJSONObject(i);
//                list.add(gson.fromJson(jo + "", FollowUsers.class));
//            }
//
//            System.out.println(list);
//        }
//    }

}
