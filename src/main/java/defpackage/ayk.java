package defpackage;

import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ayk */
public final class ayk extends SpannableStringBuilder {
    private final Class a;
    private final List b = new ArrayList();

    ayk(Class cls, CharSequence charSequence) {
        super(charSequence);
        aad.a((Object) cls, (Object) "watcherClass cannot be null");
        this.a = cls;
    }

    private ayk(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        aad.a((Object) cls, (Object) "watcherClass cannot be null");
        this.a = cls;
    }

    private final boolean a(Object obj) {
        return obj != null && a(obj.getClass());
    }

    private final boolean a(Class cls) {
        return this.a == cls;
    }

    public final CharSequence subSequence(int i, int i2) {
        return new ayk(this.a, this, i, i2);
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (a(obj)) {
            ayj ayj = new ayj(obj);
            this.b.add(ayj);
            obj = ayj;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        if (!a(cls)) {
            return super.getSpans(i, i2, cls);
        }
        ayj[] ayjArr = (ayj[]) super.getSpans(i, i2, ayj.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, ayjArr.length);
        for (int i3 = 0; i3 < ayjArr.length; i3++) {
            objArr[i3] = ayjArr[i3].a;
        }
        return objArr;
    }

    public final void removeSpan(Object obj) {
        Object b;
        if (a(obj)) {
            b = b(obj);
            if (b != null) {
                obj = b;
            }
        } else {
            b = null;
        }
        super.removeSpan(obj);
        if (b != null) {
            this.b.remove(b);
        }
    }

    public final int getSpanStart(Object obj) {
        if (a(obj)) {
            ayj b = b(obj);
            if (b != null) {
                obj = b;
            }
        }
        return super.getSpanStart(obj);
    }

    public final int getSpanEnd(Object obj) {
        if (a(obj)) {
            ayj b = b(obj);
            if (b != null) {
                obj = b;
            }
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        if (a(obj)) {
            ayj b = b(obj);
            if (b != null) {
                obj = b;
            }
        }
        return super.getSpanFlags(obj);
    }

    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (a(cls)) {
            cls = ayj.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    private final ayj b(Object obj) {
        for (int i = 0; i < this.b.size(); i++) {
            ayj ayj = (ayj) this.b.get(i);
            if (ayj.a == obj) {
                return ayj;
            }
        }
        return null;
    }

    public final void a() {
        c();
        for (int i = 0; i < this.b.size(); i++) {
            ((ayj) this.b.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    public final void b() {
        for (int i = 0; i < this.b.size(); i++) {
            ((ayj) this.b.get(i)).b.incrementAndGet();
        }
    }

    private final void c() {
        for (int i = 0; i < this.b.size(); i++) {
            ((ayj) this.b.get(i)).b.decrementAndGet();
        }
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        b();
        super.replace(i, i2, charSequence);
        c();
        return this;
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        b();
        super.replace(i, i2, charSequence, i3, i4);
        c();
        return this;
    }

    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
