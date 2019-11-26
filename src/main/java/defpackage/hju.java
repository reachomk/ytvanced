package defpackage;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Collection;

/* renamed from: hju */
final class hju extends AsyncTask {
    private final /* synthetic */ hjv a;

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Collection<agqy> collection = (Collection) obj;
        if (!isCancelled()) {
            xak.a();
            this.a.v.clear();
            this.a.r.clear();
            if (collection == null || collection.isEmpty()) {
                if (hpr.a.equals(this.a.o)) {
                    CharSequence a;
                    this.a.s.b();
                    hjv hjv = this.a;
                    TextView textView = hjv.u;
                    Bundle bundle = hjv.p;
                    if (bundle != null) {
                        arml arml;
                        byte[] byteArray = bundle.getByteArray("disabled_pref_empty_message");
                        try {
                            arml = (arml) anxl.parseFrom(arml.f, byteArray, anxa.c());
                        } catch (anyg e) {
                            xtl.a("Failed to parse FormattedString", e);
                            arml = null;
                        }
                        if (arml != null) {
                            a = ajqy.a(arml);
                            textView.setText(a);
                        }
                    }
                    a = this.a.a.getString(R.string.auto_offline_disabled_empty_message_text);
                    textView.setText(a);
                } else {
                    this.a.s.b(R.string.no_videos_found);
                }
                this.a.w.b();
            } else {
                this.a.s.b();
                xpr.a(this.a.u, false);
                for (agqy agqy : collection) {
                    agqp agqp = agqy.a;
                    this.a.r.add(agqp.a());
                    this.a.v.add(agqp);
                }
            }
            this.a.w.a();
            this.a.x = null;
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        if (isCancelled()) {
            return null;
        }
        boolean z = true;
        if (strArr.length != 1) {
            z = false;
        }
        amqw.a(z);
        return hsx.a(strArr[0], this.a.q.o().b(strArr[0]));
    }

    /* synthetic */ hju(hjv hjv) {
        this.a = hjv;
    }
}
