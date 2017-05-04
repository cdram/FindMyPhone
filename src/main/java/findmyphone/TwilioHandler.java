package findmyphone;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.twilio.twiml.Say;
import com.twilio.twiml.TwiMLException;
import com.twilio.twiml.VoiceResponse;

public class TwilioHandler {

    public String makeACallHandler(Context context) {
        LambdaLogger logger = context.getLogger();
        VoiceResponse voiceResponse = new VoiceResponse.Builder()
            .say(new Say.Builder("Hello Monkey").build())
            .build();
        try {
            return voiceResponse.toXml();
        }
        catch (TwiMLException e) {
            logger.log("Twilio Exception : " + e);
            e.printStackTrace();
            return null;
        }
    }
}
