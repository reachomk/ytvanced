package defpackage;

import android.graphics.Path;
import android.graphics.Path.FillType;
import java.util.List;

/* renamed from: bli */
public final class bli implements ble, blm {
    private final Path a = new Path();
    private final boolean b;
    private final bju c;
    private final blj d;
    private boolean e;
    private final bkr f = new bkr();

    public bli(bju bju, bnr bnr, bno bno) {
        this.b = bno.c;
        this.c = bju;
        this.d = bno.b.a();
        bnr.a(this.d);
        this.d.a((blm) this);
    }

    public final String b() {
        throw null;
    }

    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }

    public final void a(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            bku bku = (bku) list.get(i);
            if (bku instanceof blk) {
                blk blk = (blk) bku;
                if (blk.e == 1) {
                    this.f.a(blk);
                    blk.a(this);
                }
            }
        }
    }

    public final Path e() {
        if (this.e) {
            return this.a;
        }
        this.a.reset();
        if (this.b) {
            this.e = true;
            return this.a;
        }
        this.a.set((Path) this.d.f());
        this.a.setFillType(FillType.EVEN_ODD);
        this.f.a(this.a);
        this.e = true;
        return this.a;
    }
}
