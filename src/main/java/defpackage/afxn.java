package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import java.util.HashMap;
import java.util.Map;

/* renamed from: afxn */
public final class afxn {
    private final aaas a;
    private final Context b;
    private final afpu c;
    private final afpv d;
    private final aben e;
    private final bcaa f;

    public afxn(aaas aaas, afpu afpu, afpv afpv, abdx abdx, Context context, bcaa bcaa) {
        this.b = (Context) amqw.a((Object) context);
        this.a = aaas;
        this.c = afpu;
        this.d = afpv;
        this.e = new aben(abdx, null);
        this.f = bcaa;
    }

    public final void a(Intent intent) {
        afxv.a(this.b, intent);
        if (VERSION.SDK_INT >= 23) {
            afxv.b(this.b, intent);
        }
        apxu a = afxv.a(intent);
        if (a != null) {
            try {
                this.e.a(a, null);
            } catch (aabf unused) {
                xtl.d("Invalid interactions service endpoint.");
            }
        }
        String str = "push_notification_clientstreamz_logging";
        if (intent.hasExtra(str)) {
            afxh.a(this.f, str);
        }
        boolean a2 = this.c.a();
        boolean a3 = this.d.a(this.c, afxv.c(intent));
        if (!a2 || a3) {
            a = afxv.b(intent);
            if (a != null) {
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", a.b.d());
                String str2 = "notification_id";
                if (intent.hasExtra(str2)) {
                    String str3 = "notification_tag";
                    if (intent.hasExtra(str3)) {
                        afxj afxj = new afxj();
                        afxj.a = Integer.valueOf(intent.getIntExtra(str2, 0));
                        String stringExtra = intent.getStringExtra(str3);
                        if (stringExtra != null) {
                            afxj.b = stringExtra;
                            stringExtra = "";
                            if (afxj.a == null) {
                                stringExtra = stringExtra.concat(" id");
                            }
                            if (afxj.b == null) {
                                stringExtra = String.valueOf(stringExtra).concat(" tag");
                            }
                            if (stringExtra.isEmpty()) {
                                hashMap.put("notification_data", new afxk(afxj.a.intValue(), afxj.b));
                            } else {
                                String str4 = "Missing required properties:";
                                if (stringExtra.length() == 0) {
                                    stringExtra = new String(str4);
                                } else {
                                    stringExtra = str4.concat(stringExtra);
                                }
                                throw new IllegalStateException(stringExtra);
                            }
                        }
                        throw new NullPointerException("Null tag");
                    }
                }
                this.a.a(a, hashMap);
            }
        }
    }
}
