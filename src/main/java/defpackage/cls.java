package defpackage;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.List;

/* renamed from: cls */
public final class cls extends cma {
    public static final aaa g = new aaa(2);
    public List a;
    public YogaAlign b;
    public YogaAlign c;
    public YogaJustify d;
    public YogaWrap e;
    public boolean f;

    private cls() {
        super("Column");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        return this;
    }

    public static clr a(cmg cmg) {
        clr clr = (clr) g.a();
        if (clr == null) {
            clr = new clr();
        }
        clr.a(clr, cmg, new cls());
        return clr;
    }

    /* Access modifiers changed, original: protected|final */
    public final cmn c(cmg cmg) {
        coz a = cmg.f().a(!this.f ? YogaFlexDirection.COLUMN : YogaFlexDirection.COLUMN_REVERSE);
        YogaAlign yogaAlign = this.b;
        if (yogaAlign != null) {
            a.a(yogaAlign);
        }
        yogaAlign = this.c;
        if (yogaAlign != null) {
            a.b(yogaAlign);
        }
        YogaJustify yogaJustify = this.d;
        if (yogaJustify != null) {
            a.a(yogaJustify);
        }
        YogaWrap yogaWrap = this.e;
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
        cls cls = (cls) cma;
        if (this.j == cls.j) {
            return true;
        }
        List list = this.a;
        if (list != null) {
            if (cls.a != null && list.size() == cls.a.size()) {
                int size = this.a.size();
                int i = 0;
                while (i < size) {
                    if (((cma) this.a.get(i)).a((cma) cls.a.get(i))) {
                        i++;
                    }
                }
            }
            return false;
        } else if (cls.a != null) {
            return false;
        }
        YogaAlign yogaAlign = this.b;
        if (!yogaAlign == null ? yogaAlign.equals(cls.b) : cls.b == null) {
            return false;
        }
        yogaAlign = this.c;
        if (!yogaAlign == null ? yogaAlign.equals(cls.c) : cls.c == null) {
            return false;
        }
        YogaJustify yogaJustify = this.d;
        if (yogaJustify == null ? cls.d == null : yogaJustify.equals(cls.d)) {
            return this.f == cls.f;
        } else {
            return false;
        }
    }
}
