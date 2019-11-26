package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sij */
public final class sij {
    public sil a;
    private sik b;
    private sfq c;
    private final Application d;
    private final sgz e;

    public sij(Application application, sgz sgz) {
        this.d = application;
        this.e = sgz;
    }

    public final void a(sik sik) {
        this.b = sik;
        sfq sfq = this.c;
        if (sfq != null) {
            sik sik2 = this.b;
            if (sik2 != null) {
                sik2.c(sfq);
            }
        }
    }

    public final void a(sfq sfq) {
        this.c = sfq;
        sik sik = this.b;
        if (sik != null) {
            sik.c(this.c);
        }
    }

    public final void a(Intent intent) {
        if (this.a == null) {
            Throwable th;
            bcfs a = bcfs.a(intent);
            bcgg.a(intent);
            String str = "net.openid.appauth.AuthorizationException";
            ansx ansx = null;
            if (intent.hasExtra(str)) {
                try {
                    String stringExtra = intent.getStringExtra(str);
                    bcgg.a(stringExtra, (Object) "jsonStr cannot be null or empty");
                    Object jSONObject = new JSONObject(stringExtra);
                    bcgg.a(jSONObject, (Object) "json cannot be null");
                    Throwable bcfl = new bcfl(jSONObject.getInt("type"), jSONObject.getInt("code"), bcgb.b(jSONObject, "error"), bcgb.b(jSONObject, "errorDescription"), bcgb.d(jSONObject, "errorUri"));
                } catch (JSONException e) {
                    throw new IllegalArgumentException("Intent contains malformed exception data", e);
                }
            }
            th = null;
            if (a != null) {
                sgz sgz = this.e;
                String str2 = (String) a.j.get("redirect_state");
                if (!TextUtils.isEmpty(str2)) {
                    sgj sgj = new sgj();
                    sgj.a = sgz.a;
                    sgj.b = sgz.f;
                    sgj.c = str2;
                    if (sgj.a == null) {
                        throw new IllegalArgumentException("Service id must be set");
                    } else if (sgj.b != null) {
                        ansq ansq = (ansq) ansr.d.createBuilder();
                        if (TextUtils.isEmpty(sgj.c)) {
                            throw new IllegalArgumentException("OAuthState must be set");
                        }
                        str = sgj.c;
                        ansq.copyOnWrite();
                        ansr ansr = (ansr) ansq.instance;
                        if (str != null) {
                            ansr.a = 7;
                            ansr.b = str;
                            answ a2 = sgf.a(sgf.a(sgj.a));
                            a2.a(sgj.a);
                            a2.a(antp.APP_AUTH);
                            a2.a(sju.a(Arrays.asList(sgj.b)));
                            a2.a((ansr) ((anxl) ansq.build()));
                            ansx = (ansx) ((anxl) a2.build());
                        } else {
                            throw new NullPointerException();
                        }
                    } else {
                        throw new IllegalArgumentException("Scopes must be set");
                    }
                }
                if (ansx != null) {
                    this.a = new sil(ansx, this.e);
                    this.a.execute(new Context[]{this.d});
                    this.a.a.a(new sii(this), sfv.a());
                    return;
                }
                a(new sfq(2, th));
                return;
            }
            sfr a3 = sfr.a(th);
            a(new sfq(a3.a, a3));
        }
    }
}
