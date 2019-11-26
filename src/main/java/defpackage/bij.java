package defpackage;

/* renamed from: bij */
public abstract class bij {
    public final zj b;
    public final zj c;
    public final zj d;

    public bij(zj zjVar, zj zjVar2, zj zjVar3) {
        this.b = zjVar;
        this.c = zjVar2;
        this.d = zjVar3;
    }

    public abstract void a();

    public abstract void a(String str);

    public abstract bij b();

    public final Class a(Class cls) {
        Class cls2 = (Class) this.d.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.d.put(cls.getName(), cls2);
        return cls2;
    }
}
