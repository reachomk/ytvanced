package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: anph */
final class anph extends Handler {
    private final /* synthetic */ anpi a;

    anph(anpi anpi, Looper looper) {
        this.a = anpi;
        super(looper);
    }

    public final void handleMessage(Message message) {
        anpi anpi = this.a;
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("FirebaseInstanceId", "Dropping invalid message");
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new anqa());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof anpx) {
                anpi.e = (anpx) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                anpi.d = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent2.getAction())) {
            CharSequence stringExtra = intent2.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            String group;
            if (stringExtra != null) {
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (matcher.matches()) {
                    String group2 = matcher.group(1);
                    group = matcher.group(2);
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group);
                    anpi.a(group2, extras);
                }
            } else {
                group = intent2.getStringExtra("error");
                String valueOf;
                if (group == null) {
                    valueOf = String.valueOf(intent2.getExtras());
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 49);
                    stringBuilder.append("Unexpected response, no error or registration id ");
                    stringBuilder.append(valueOf);
                    Log.w("FirebaseInstanceId", stringBuilder.toString());
                } else if (group.startsWith("|")) {
                    String[] split = group.split("\\|");
                    if (split.length > 2) {
                        if ("ID".equals(split[1])) {
                            group = split[2];
                            String str = split[3];
                            if (str.startsWith(":")) {
                                str = str.substring(1);
                            }
                            anpi.a(group, intent2.putExtra("error", str).getExtras());
                            return;
                        }
                    }
                    valueOf = "Unexpected structured response ";
                    Log.w("FirebaseInstanceId", group.length() == 0 ? new String(valueOf) : valueOf.concat(group));
                } else {
                    synchronized (anpi.a) {
                        int i = 0;
                        while (true) {
                            aac aac = anpi.a;
                            if (i >= aac.b) {
                            } else {
                                anpi.a((String) aac.b(i), intent2.getExtras());
                                i++;
                            }
                        }
                    }
                }
            }
        }
    }
}
