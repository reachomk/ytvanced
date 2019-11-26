package defpackage;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: ahor */
public class ahor extends ahqd implements Iterable {
    private final LinkedList a = new LinkedList();
    private final String b = getClass().getSimpleName();
    private ahqb c;
    public boolean d = false;

    public void d(ahnj ahnj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahqb) it.next()).d(ahnj);
        }
    }

    public void a(ahse ahse) {
        if (!f()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ahqb ahqb = (ahqb) it.next();
                if (!ahqb.f()) {
                    ahqb.a(ahse);
                }
            }
        }
    }

    public void e(ahnj ahnj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahqb) it.next()).e(ahnj);
        }
    }

    public void bd_() {
        String valueOf = String.valueOf(this.b);
        String str = "Shutting down renderer on ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            str.concat(valueOf);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahqb) it.next()).bd_();
        }
    }

    public void a(boolean z, ahnj ahnj) {
        ahqb ahqb = this.c;
        if (ahqb != null) {
            ahqb.a(false, ahnj);
            this.c = null;
        }
        if (z) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ahqb = (ahqb) it.next();
                if (!ahqb.f() && ahqb.f(ahnj)) {
                    break;
                }
            }
            ahqb = null;
            this.c = ahqb;
            ahqb ahqb2 = this.c;
            if (ahqb2 != null) {
                ahqb2.a(true, ahnj);
            }
        }
    }

    public boolean f(ahnj ahnj) {
        if (!f()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ahqb ahqb = (ahqb) it.next();
                if (!ahqb.f() && ahqb.f(ahnj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void b(float f, float f2, float f3) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahqb) it.next()).b(f, f2, f3);
        }
    }

    public final Iterator iterator() {
        return this.a.iterator();
    }

    public void a(ahqb ahqb) {
        a(this.a.size(), ahqb);
    }

    public final void a(int i, ahqb ahqb) {
        if (this.a.contains(ahqb)) {
            String str = this.b;
            String simpleName = ahqb.getClass().getSimpleName();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 43) + simpleName.length());
            stringBuilder.append(str);
            stringBuilder.append(" NOT adding child - already has been added ");
            stringBuilder.append(simpleName);
            xtl.d(stringBuilder.toString());
            return;
        }
        String str2 = this.b;
        String simpleName2 = ahqb.getClass().getSimpleName();
        String.valueOf(str2).length();
        simpleName2.length();
        this.a.add(i, ahqb);
        ahqb.b(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean by_() {
        return this.c != null;
    }
}
