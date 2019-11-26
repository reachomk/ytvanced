package defpackage;

import android.graphics.Path;
import android.graphics.Path.Op;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: blb */
public final class blb implements bkz, ble {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List d = new ArrayList();
    private final bnf e;

    public blb(bnf bnf) {
        this.e = bnf;
    }

    public final String b() {
        throw null;
    }

    public final void a(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            bku bku = (bku) listIterator.previous();
            if (bku instanceof ble) {
                this.d.add((ble) bku);
                listIterator.remove();
            }
        }
    }

    public final void a(List list, List list2) {
        for (int i = 0; i < this.d.size(); i++) {
            ((ble) this.d.get(i)).a(list, list2);
        }
    }

    public final Path e() {
        this.c.reset();
        bnf bnf = this.e;
        if (bnf.b) {
            return this.c;
        }
        int i = bnf.c;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                for (i = 0; i < this.d.size(); i++) {
                    this.c.addPath(((ble) this.d.get(i)).e());
                }
            } else if (i2 == 1) {
                a(Op.UNION);
            } else if (i2 == 2) {
                a(Op.REVERSE_DIFFERENCE);
            } else if (i2 == 3) {
                a(Op.INTERSECT);
            } else if (i2 == 4) {
                a(Op.XOR);
            }
            return this.c;
        }
        throw null;
    }

    private final void a(Op op) {
        List c;
        this.b.reset();
        this.a.reset();
        int size = this.d.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            ble ble = (ble) this.d.get(size);
            if (ble instanceof bkt) {
                bkt bkt = (bkt) ble;
                c = bkt.c();
                int size2 = c.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    }
                    Path e = ((ble) c.get(size2)).e();
                    e.transform(bkt.d());
                    this.b.addPath(e);
                }
            } else {
                this.b.addPath(ble.e());
            }
        }
        int i = 0;
        ble ble2 = (ble) this.d.get(0);
        if (ble2 instanceof bkt) {
            bkt bkt2 = (bkt) ble2;
            c = bkt2.c();
            while (i < c.size()) {
                Path e2 = ((ble) c.get(i)).e();
                e2.transform(bkt2.d());
                this.a.addPath(e2);
                i++;
            }
        } else {
            this.a.set(ble2.e());
        }
        this.c.op(this.a, this.b, op);
    }
}
