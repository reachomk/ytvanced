package defpackage;

import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* renamed from: ackm */
public final class ackm implements Runnable {
    private final /* synthetic */ LiveCreationActivity a;

    public ackm(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public final void run() {
        aceo aceo = this.a.J;
        if (!(aceo.a || TextUtils.isEmpty(aceo.c))) {
            CharSequence encodeToString;
            aceo = this.a.J;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(aceo);
                objectOutputStream.close();
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (IOException e) {
                xtl.b("Serialization of live stream config data to Shared Preferences failed.", e);
                encodeToString = null;
            }
            if (TextUtils.isEmpty(encodeToString)) {
                xtl.c("Failed to save the live stream state to shared preference.");
                return;
            }
            Editor edit = xly.a(this.a).edit();
            edit.putString("SHARED_PREF_STREAM_CONFIG_KEY", encodeToString);
            edit.commit();
        }
    }
}
