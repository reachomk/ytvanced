package defpackage;

import android.content.Context;
import android.os.Handler;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import java.util.List;

/* renamed from: adxn */
public final class adxn {
    public static final String a = xtl.b("MdxSpeechController");
    public final adxs b;
    public SpeechRecognizer c;
    public List d;
    public List e;
    public String f;
    public String g;
    private final Context h;
    private final Handler i;
    private adxp j;
    private final RecognitionListener k = new adxq(this);

    public adxn(Context context, Handler handler, adxs adxs) {
        this.h = context;
        this.i = handler;
        this.b = adxs;
        a();
    }

    public final void a() {
        if (SpeechRecognizer.isRecognitionAvailable(this.h)) {
            SpeechRecognizer speechRecognizer = this.c;
            if (speechRecognizer != null) {
                try {
                    speechRecognizer.destroy();
                } catch (Throwable th) {
                    String str = a;
                    String str2 = "Non-Fatal error while destroying speech. ";
                    String valueOf = String.valueOf(th.getMessage());
                    if (valueOf.length() == 0) {
                        valueOf = new String(str2);
                    } else {
                        valueOf = str2.concat(valueOf);
                    }
                    xtl.b(str, valueOf);
                } finally {
                    this.c = null;
                }
            }
            this.c = SpeechRecognizer.createSpeechRecognizer(this.h);
            this.c.setRecognitionListener(this.k);
        } else {
            this.c = null;
            this.b.e();
        }
        this.e = null;
        this.d = null;
        this.f = null;
    }

    public final void b() {
        this.b.a(f());
        a();
    }

    public final void c() {
        d();
        this.j = new adxp(this);
        this.i.postDelayed(this.j, 4000);
    }

    public final void d() {
        adxp adxp = this.j;
        if (adxp != null) {
            this.i.removeCallbacks(adxp);
            this.j = null;
        }
    }

    public final StringBuilder e() {
        StringBuilder stringBuilder = new StringBuilder("");
        List<String> list = this.d;
        if (list != null) {
            for (String append : list) {
                stringBuilder.append(append);
                stringBuilder.append(" ");
            }
        }
        return stringBuilder;
    }

    public final String f() {
        StringBuilder e = e();
        if (!TextUtils.isEmpty(this.f)) {
            e.append(this.f);
        }
        return e.toString().trim();
    }
}
