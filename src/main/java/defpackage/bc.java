package defpackage;

/* renamed from: bc */
public final class bc {
    private final be a;
    private final bf b;

    public bc(bf bfVar, be beVar) {
        this.a = beVar;
        this.b = bfVar;
    }

    public final az a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
            stringBuilder.append(canonicalName);
            canonicalName = stringBuilder.toString();
            az azVar = (az) this.b.a.get(canonicalName);
            if (!cls.isInstance(azVar)) {
                azVar = this.a.a(cls);
                az azVar2 = (az) this.b.a.put(canonicalName, azVar);
                if (azVar2 != null) {
                    azVar2.a();
                }
            }
            return azVar;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
