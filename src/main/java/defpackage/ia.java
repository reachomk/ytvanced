package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: ia */
public final class ia {
    public ht a;
    public ht b;
    public ht c;
    public ht d;
    public hv e;
    public hv f;
    public hv g;
    public hv h;
    public final Set i;

    public ia() {
        this.i = new LinkedHashSet();
        a(hz.a());
        b(hz.a());
        c(hz.a());
        d(hz.a());
        a(hz.b());
        b(hz.b());
        c(hz.b());
        d(hz.b());
        b();
    }

    public ia(ia iaVar) {
        this.i = new LinkedHashSet();
        a((ht) iaVar.a.clone());
        b((ht) iaVar.b.clone());
        c((ht) iaVar.c.clone());
        d((ht) iaVar.d.clone());
        a((hv) iaVar.h.clone());
        b((hv) iaVar.e.clone());
        c((hv) iaVar.f.clone());
        d((hv) iaVar.g.clone());
    }

    public ia(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, 0);
    }

    public ia(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this.i = new LinkedHashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hy.a, i, i2);
        i = obtainStyledAttributes.getResourceId(hy.b, 0);
        int resourceId = obtainStyledAttributes.getResourceId(hy.c, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            context = new ContextThemeWrapper(context, i);
            i = resourceId;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, hy.d);
        int i4 = obtainStyledAttributes2.getInt(hy.e, 0);
        i = obtainStyledAttributes2.getInt(6, i4);
        i2 = obtainStyledAttributes2.getInt(7, i4);
        resourceId = obtainStyledAttributes2.getInt(8, i4);
        i4 = obtainStyledAttributes2.getInt(9, i4);
        i3 = obtainStyledAttributes2.getDimensionPixelSize(hy.f, i3);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(1, i3);
        int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(2, i3);
        int dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(3, i3);
        i3 = obtainStyledAttributes2.getDimensionPixelSize(4, i3);
        a(hz.a(i, dimensionPixelSize));
        b(hz.a(i2, dimensionPixelSize2));
        c(hz.a(resourceId, dimensionPixelSize3));
        d(hz.a(i4, i3));
        b(hz.b());
        c(hz.b());
        d(hz.b());
        a(hz.b());
        obtainStyledAttributes2.recycle();
    }

    public final void a(float f, float f2, float f3, float f4) {
        int i;
        int i2;
        ht htVar = this.a;
        int i3 = 1;
        if (htVar.a != f) {
            htVar.a = f;
            i = 1;
        } else {
            i = 0;
        }
        htVar = this.b;
        if (htVar.a != f2) {
            htVar.a = f2;
            i2 = 1;
        } else {
            i2 = 0;
        }
        i |= i2;
        ht htVar2 = this.c;
        if (htVar2.a != f3) {
            htVar2.a = f3;
            i2 = 1;
        } else {
            i2 = 0;
        }
        i |= i2;
        htVar2 = this.d;
        if (htVar2.a != f4) {
            htVar2.a = f4;
        } else {
            i3 = 0;
        }
        if ((i | i3) != 0) {
            b();
        }
    }

    private final boolean a(ht htVar) {
        if (this.a == htVar) {
            return false;
        }
        this.a = htVar;
        return true;
    }

    private final boolean b(ht htVar) {
        if (this.b == htVar) {
            return false;
        }
        this.b = htVar;
        return true;
    }

    private final boolean c(ht htVar) {
        if (this.c == htVar) {
            return false;
        }
        this.c = htVar;
        return true;
    }

    private final boolean d(ht htVar) {
        if (this.d == htVar) {
            return false;
        }
        this.d = htVar;
        return true;
    }

    private final boolean a(hv hvVar) {
        if (this.h == hvVar) {
            return false;
        }
        this.h = hvVar;
        return true;
    }

    private final boolean b(hv hvVar) {
        if (this.e == hvVar) {
            return false;
        }
        this.e = hvVar;
        return true;
    }

    private final boolean c(hv hvVar) {
        if (this.f == hvVar) {
            return false;
        }
        this.f = hvVar;
        return true;
    }

    private final boolean d(hv hvVar) {
        if (this.g == hvVar) {
            return false;
        }
        this.g = hvVar;
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void a(id idVar) {
        this.i.add(idVar);
    }

    private final void b() {
        for (id idVar : this.i) {
            if (idVar != null) {
                idVar.c();
            }
        }
    }

    public final boolean a() {
        Object obj;
        Object obj2 = (this.h.getClass().equals(hv.class) && this.f.getClass().equals(hv.class) && this.e.getClass().equals(hv.class) && this.g.getClass().equals(hv.class)) ? 1 : null;
        ht htVar = this.a;
        float f = htVar.a;
        ht htVar2 = this.b;
        if (htVar2.a == f && this.d.a == f && this.c.a == f) {
            obj = 1;
        } else {
            obj = null;
        }
        Object obj3 = ((htVar2 instanceof ib) && (htVar instanceof ib) && (this.c instanceof ib) && (this.d instanceof ib)) ? 1 : null;
        return (obj2 == null || obj == null || obj3 == null) ? false : true;
    }
}
