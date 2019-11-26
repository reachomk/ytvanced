package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kkk */
public final class kkk extends klf implements xcp {
    private final xci e;
    private final aadw f;
    private bbnc g;
    private fid h;

    public kkk(aaas aaas, akvp akvp, Context context, xci xci, aadw aadw, ViewGroup viewGroup) {
        super(aaas, akvp, context, viewGroup);
        this.e = xci;
        this.f = aadw;
    }

    public kkk(aaas aaas, akvp akvp, Context context, xci xci, aadw aadw, ViewGroup viewGroup, int i, kld kld) {
        super(aaas, akvp, context, viewGroup, i, kld);
        this.e = xci;
        this.f = aadw;
    }

    public final void a() {
        super.a();
        this.e.b(this);
        bbnc bbnc = this.g;
        if (bbnc != null) {
            bbnc.bK_();
            this.g = null;
        }
    }

    public final void a(axpi axpi) {
        super.a(axpi);
        fid fid = this.h;
        if (fid != null) {
            Object obj = this.d;
            if (obj != null) {
                String str = fid.a;
                auad auad = ((axpi) obj).d;
                if (auad == null) {
                    auad = auad.d;
                }
                if (TextUtils.equals(str, auad.b)) {
                    a(kkk.a((axpi) this.d, this.h.b));
                } else {
                    this.h = null;
                }
            }
        }
        if (TextUtils.isEmpty(axpi.e)) {
            this.e.a((Object) this);
        } else {
            bbmi a = this.f.a(axpi.e, true).a(bbmt.a());
            bbnc bbnc = this.g;
            if (bbnc != null) {
                bbnc.bK_();
            }
            this.g = a.c(new kkn(this));
        }
        axpi = (axpi) this.d;
        if (axpi.b) {
            this.b.setId(R.id.like_button);
        } else if (axpi.c) {
            this.b.setId(R.id.dislike_button);
        }
        d();
    }

    public final void onClick(View view) {
        apxu apxu;
        aphv aphv;
        if (c()) {
            aphv = this.c;
            if ((aphv.a & 16384) != 0) {
                apxu = aphv.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                return;
            }
        }
        aphv = this.c;
        if ((aphv.a & 512) != 0) {
            apxu = aphv.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            return;
        }
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        this.a.a(apxu, hashMap);
    }

    public static boolean a(axpi axpi, auac auac) {
        boolean z = true;
        if (!(axpi.b && auac == auac.LIKE)) {
            if (!axpi.c) {
                z = false;
            } else if (auac == auac.DISLIKE) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{fid.class};
        } else if (i == 0) {
            fid fid = (fid) obj;
            auad auad = ((axpi) this.d).d;
            if (auad == null) {
                auad = auad.d;
            }
            if (TextUtils.equals(auad.b, fid.a)) {
                a(kkk.a((axpi) this.d, fid.b));
                d();
                this.h = fid;
                return null;
            }
            this.h = null;
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
