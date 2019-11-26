package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: lth */
public final class lth extends akyh {
    private final aana c;
    private final bcaa d;
    private final lsz e;
    private final weo f;
    private final jhz g;
    private final jhy h;
    private final jhd i;
    private final Context j;
    private final akdk k;
    private final akdk l;
    private final xci m;
    private final akvz n;
    private final amqp o;

    public lth(Context context, haq haq, xci xci, akvz akvz, xoi xoi, acvx acvx, bcaa bcaa, lsz lsz, weo weo, jhz jhz, jhd jhd, akdk akdk, akdk akdk2, amqp amqp, akvj akvj, jhy jhy) {
        super(haq, xci, akvz, xoi, acvx, akvj);
        this.j = context;
        this.m = xci;
        this.n = akvz;
        this.c = haq;
        this.d = bcaa;
        this.e = lsz;
        this.f = weo;
        this.g = jhz;
        this.i = jhd;
        this.k = akdk;
        this.l = akdk2;
        this.h = jhy;
        this.o = amqp;
    }

    public final akvy a(Object obj, akyd akyd, akxv akxv) {
        if (obj instanceof aafj) {
            akwe akwe;
            aafj aafj = (aafj) obj;
            ajws ajws = aafj.a.d;
            if (ajws == null || ajws.c == null) {
                akwe = (akwe) this.d.get();
            } else {
                akwe = this.f.a(this.c, this.b);
            }
            akwe.a(aafj);
            akwe.a().a(new akvl(this.a));
            return akwe;
        } else if (obj instanceof axpw) {
            return this.e.a((axpw) obj);
        } else {
            if (obj instanceof akao) {
                akao akao = (akao) obj;
                akan akan = akao.d;
                ajvy ajvy = akan != null ? akan.b : null;
                if (ajvy != null) {
                    jhy jhy = this.h;
                    if (jhy == null) {
                        jhy = new jhy(this.j);
                    }
                    jhy.b = ajvy.e;
                    jhy.a = ajvy.c;
                    jhy.a(jhy.a(this.j));
                    arsm arsm = ajvy.d;
                    if (arsm != null) {
                        int a = arso.a(arsm.b);
                        if (a != 0 && a == 4) {
                            return this.i.a(akao, ajvy, jhy, akyd);
                        }
                    }
                    jhv a2 = this.g.a(akao, ajvy, jhy, akyd);
                    if (a2 == null) {
                        return null;
                    }
                    int dimensionPixelSize = this.j.getResources().getDimensionPixelSize(R.dimen.watch_next_horizontal_grid_padding);
                    a2.e.a(new aknp(dimensionPixelSize, dimensionPixelSize));
                    return a2;
                }
            }
            akao akao2;
            if (obj instanceof aafg) {
                akao2 = ((aafg) obj).a;
                return new lsv(this.n, this.m, akao2, akxy.a(akao2), this.a, this.k, this.o, akyd);
            } else if (!(obj instanceof aafs)) {
                return super.a(obj, akyd, akxv);
            } else {
                akao2 = ((aafs) obj).a;
                return new akye(this.n, this.m, akao2, akxy.b(akao2), this.l, akyd);
            }
        }
    }
}
