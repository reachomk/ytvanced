package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;

/* renamed from: anqi */
final class anqi implements ryc {
    anqi() {
    }

    public final /* synthetic */ Object a(ryi ryi) {
        Bundle bundle = (Bundle) ryi.a(IOException.class);
        String str = "SERVICE_NOT_AVAILABLE";
        if (bundle != null) {
            Object string = bundle.getString("registration_id");
            if (string == null) {
                string = bundle.getString("unregistered");
                if (string == null) {
                    String string2 = bundle.getString("error");
                    if ("RST".equals(string2)) {
                        throw new IOException("INSTANCE_ID_RESET");
                    } else if (string2 != null) {
                        throw new IOException(string2);
                    } else {
                        String valueOf = String.valueOf(bundle);
                        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
                        stringBuilder.append("Unexpected response: ");
                        stringBuilder.append(valueOf);
                        Log.w("FirebaseInstanceId", stringBuilder.toString(), new Throwable());
                        throw new IOException(str);
                    }
                }
            }
            return string;
        }
        throw new IOException(str);
    }
}
