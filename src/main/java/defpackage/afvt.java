package defpackage;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Locale;

/* renamed from: afvt */
final class afvt implements afws {
    public final xsc a;
    public final afwr b;
    private final anqr c;
    private final String d;

    public afvt(xsc xsc, anqr anqr, String str, afwr afwr) {
        this.a = xsc;
        this.c = anqr;
        this.d = xvd.a(str);
        this.b = (afwr) amqw.a((Object) afwr);
    }

    public final void a(afwc afwc) {
        ryi a;
        long b = this.a.b();
        String str = " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}";
        String str2 = "Invalid topic name: ";
        String str3 = "FirebaseMessaging";
        String str4 = "/topics/";
        anqr anqr;
        CharSequence charSequence;
        StringBuilder stringBuilder;
        if (afwc == afwc.SUBSCRIBE) {
            anqr = this.c;
            charSequence = this.d;
            if (charSequence != null && charSequence.startsWith(str4)) {
                Log.w(str3, "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in subscribeToTopic.");
                charSequence = charSequence.substring(8);
            }
            if (charSequence == null || !anqr.a.matcher(charSequence).matches()) {
                stringBuilder = new StringBuilder(String.valueOf(charSequence).length() + 78);
                stringBuilder.append(str2);
                stringBuilder.append(charSequence);
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            FirebaseInstanceId firebaseInstanceId = anqr.b;
            str = "S!";
            if (charSequence.length() == 0) {
                str2 = new String(str);
            } else {
                str2 = str.concat(charSequence);
            }
            a = firebaseInstanceId.a(str2);
        } else if (afwc == afwc.UNSUBSCRIBE) {
            anqr = this.c;
            charSequence = this.d;
            if (charSequence != null && charSequence.startsWith(str4)) {
                Log.w(str3, "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in unsubscribeFromTopic.");
                charSequence = charSequence.substring(8);
            }
            if (charSequence == null || !anqr.a.matcher(charSequence).matches()) {
                stringBuilder = new StringBuilder(String.valueOf(charSequence).length() + 78);
                stringBuilder.append(str2);
                stringBuilder.append(charSequence);
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            str = "U!";
            a = anqr.b.a(charSequence.length() == 0 ? new String(str) : str.concat(charSequence));
        } else {
            this.b.a(String.format(Locale.US, "Unknown operation %s", new Object[]{afwc.name()}));
            return;
        }
        a.a(new afvw(this, b, afwc));
    }
}
