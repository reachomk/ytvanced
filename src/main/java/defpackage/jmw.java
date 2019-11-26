package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;

/* renamed from: jmw */
public final class jmw extends akyh {
    private final aana c;
    private final xci d;
    private final akvz e;
    private final jja f;
    private final jjk g;
    private final Context h;
    private final Handler i;
    private final RecyclerView j;

    public jmw(Context context, aana aana, xci xci, akvz akvz, xoi xoi, acvx acvx, jja jja, jjk jjk, Handler handler, RecyclerView recyclerView) {
        super(aana, xci, akvz, xoi, acvx, null);
        this.h = context;
        this.c = (aana) amqw.a((Object) aana);
        this.d = (xci) amqw.a((Object) xci);
        this.e = (akvz) amqw.a((Object) akvz);
        this.f = jja;
        this.g = jjk;
        this.i = handler;
        this.j = recyclerView;
    }

    public final akvy a(Object obj, akyd akyd, akxv akxv) {
        if (obj instanceof akbk) {
            return new iup(this.h, this.e, this.d, this.i, (akbk) obj, this.j, akxv);
        }
        if (obj instanceof ajuq) {
            return new jht(this.e, this.d, (ajuq) obj);
        }
        if (obj instanceof aafj) {
            jip a = this.f.a(this.c, this.b, akyd);
            if (akyd == null) {
                a.a((aafj) obj);
            }
            return a;
        } else if (obj instanceof axdw) {
            return new iuk((axdw) obj);
        } else {
            if (!(obj instanceof aafs)) {
                return super.a(obj, akyd, akxv);
            }
            akao akao = ((aafs) obj).a;
            return this.g.a(akao, akxy.b(akao), akyd, null);
        }
    }
}
