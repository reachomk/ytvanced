package defpackage;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.List;

/* renamed from: cqz */
public final class cqz extends cma {
    public static final aaa f = new aaa(2);
    public List a;
    public YogaAlign b;
    public YogaJustify c;
    public YogaWrap d;
    public boolean e;

    private cqz() {
        super("Row");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        return this;
    }

    public static cqy a(cmg cmg) {
        cqy cqy = (cqy) f.a();
        if (cqy == null) {
            cqy = new cqy();
        }
        cqy.a(cqy, cmg, new cqz());
        return cqy;
    }

    /* Access modifiers changed, original: protected|final */
    public final cmn c(cmg cmg) {
        coz a = cmg.f().a(!this.e ? YogaFlexDirection.ROW : YogaFlexDirection.ROW_REVERSE);
        YogaAlign yogaAlign = this.b;
        if (yogaAlign != null) {
            a.a(yogaAlign);
        }
        YogaJustify yogaJustify = this.c;
        if (yogaJustify != null) {
            a.a(yogaJustify);
        }
        YogaWrap yogaWrap = this.d;
        if (yogaWrap != null) {
            a.a(yogaWrap);
        }
        List list = this.a;
        if (!(list == null || (this.o && crf.a(cmg, list, a)))) {
            for (cma a2 : this.a) {
                a.a(a2);
            }
        }
        return a;
    }

    public final boolean a(cma cma) {
        if (this == cma) {
            return true;
        }
        if (cma == null || getClass() != cma.getClass()) {
            return false;
        }
        cqz cqz = (cqz) cma;
        if (this.j == cqz.j) {
            return true;
        }
        List list = this.a;
        if (list != null) {
            if (cqz.a != null && list.size() == cqz.a.size()) {
                int size = this.a.size();
                int i = 0;
                while (i < size) {
                    if (((cma) this.a.get(i)).a((cma) cqz.a.get(i))) {
                        i++;
                    }
                }
            }
            return false;
        } else if (cqz.a != null) {
            return false;
        }
        YogaAlign yogaAlign = this.b;
        if (!yogaAlign == null ? yogaAlign.equals(cqz.b) : cqz.b == null) {
            return false;
        }
        YogaJustify yogaJustify = this.c;
        if (yogaJustify == null ? cqz.c == null : yogaJustify.equals(cqz.c)) {
            return this.e == cqz.e;
        } else {
            return false;
        }
    }
}
