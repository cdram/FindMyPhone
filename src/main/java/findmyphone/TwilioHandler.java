package findmyphone;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.util.json.JSONException;
import com.amazonaws.util.json.JSONObject;


public class TwilioHandler {

    public String makeACallHandler(Context context) throws JSONException {
        return "Sherlock found your phone";
    }
}
