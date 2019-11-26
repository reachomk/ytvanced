package defpackage;

import android.os.AsyncTask;
import android.os.Bundle;
import java.net.Inet4Address;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: adse */
final class adse extends AsyncTask {
    public final Bundle a;
    private final tbn b;
    private final adei c;
    private final adeb d;

    adse(tbn tbn, adeb adeb, adei adei, Bundle bundle) {
        this.b = tbn;
        this.d = adeb;
        this.c = adei;
        this.a = bundle;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        this.c.a(this.a);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        adeb adeb = this.d;
        tbn tbn = this.b;
        adsd adsd = new adsd(this, countDownLatch);
        Inet4Address c = tbn.c();
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uuid", uuid);
            adeb.b.b(new xlb(String.format(Locale.US, "http://%s:%d/%s", new Object[]{c.getHostAddress(), Integer.valueOf(8008), "setup/send_log_report"}), jSONObject, new adee(adsd), new aded(adsd), true));
        } catch (JSONException e) {
            xtl.a(adeb.a, "Failed creating json object", e);
            adsd.a(null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            xtl.a(adsc.a, "Failed filling casting crash report id", e2);
        }
        return null;
    }
}
