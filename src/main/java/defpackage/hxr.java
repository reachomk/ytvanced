package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: hxr */
public final class hxr implements aihv, ajan, xcp {
    public final nn a;
    public final hwr b;
    public final hxx c;
    private final zzl d;
    private final zyw e;
    private aajq[] f;
    private int g;

    public hxr(nn nnVar, hxx hxx, zzl zzl, zyw zyw) {
        this.a = nnVar;
        this.b = new hwr(R.id.controls_overlay_menu_video_quality, nnVar.getString(R.string.quality_title), new hxy(this));
        this.b.d = ra.a((Context) nnVar, (int) R.drawable.quantum_ic_settings_grey600_24);
        this.c = hxx;
        this.d = zzl;
        this.e = zyw;
    }

    public final long e() {
        return 1;
    }

    public final void a(aihy aihy) {
        this.c.a(aihy);
    }

    public final void g(boolean z) {
        this.b.a(z);
    }

    public final void a(aajq[] aajqArr, int i, boolean z) {
        this.f = aajqArr;
        this.c.a(aajqArr, i, this.g, z, a());
        String str = null;
        if (aajqArr != null && i >= 0 && i < aajqArr.length) {
            str = aajqArr[i].b;
        }
        this.b.a(str);
        if (a()) {
            if (z) {
                if (str == null || i == 0) {
                    if (aajqArr != null) {
                        int i2 = this.g;
                        if (i2 > 0 && i2 < aajqArr.length) {
                            str = aajqArr[i2].b;
                        }
                    }
                    str = "";
                }
                hwr hwr = this.b;
                String string = this.a.getString(R.string.quality_auto);
                str = this.a.getString(R.string.quality_label, new Object[]{str});
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(string).length() + 1) + String.valueOf(str).length());
                stringBuilder.append(string);
                stringBuilder.append(" ");
                stringBuilder.append(str);
                hwr.a(stringBuilder.toString());
            } else {
                this.b.a(amqu.b(str));
            }
            this.g = i;
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.a(hxu.a, hxt.a).f().a(emg.a(this.e, 1125899906842624L, 1)).a(new hxw(this), hxv.a)};
    }

    public final void a(ahjb ahjb) {
        if (this.f != null) {
            aajq[] aajqArr;
            boolean z = false;
            int i = 0;
            while (true) {
                aajqArr = this.f;
                if (i < aajqArr.length) {
                    if (aajqArr[i].a == ahjb.a) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                if (ahjb.a == -2) {
                    z = true;
                }
                a(aajqArr, i, z);
            }
        }
    }

    private final boolean a() {
        zzl zzl = this.d;
        if (!(zzl == null || zzl.b() == null)) {
            awdw awdw = this.d.b().l;
            if (awdw == null) {
                awdw = awdw.E;
            }
            if (awdw.C) {
                return true;
            }
        }
        return false;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjb.class};
        } else if (i == 0) {
            a((ahjb) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
