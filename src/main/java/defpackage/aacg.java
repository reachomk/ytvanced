package defpackage;

/* renamed from: aacg */
final class aacg implements aabo {
    public final String a;
    public final aadu b;
    public final /* synthetic */ aabs c;

    public final bbme a(int i) {
        return bbme.a(new aacj(this, i));
    }

    /* synthetic */ aacg(aabs aabs, String str, aadu aadu) {
        this.c = aabs;
        this.a = (String) amqw.a((Object) str, (Object) "Cannot store metadata for a null key");
        this.b = (aadu) amqw.a((Object) aadu, (Object) "Storing null metadata is not allowed");
    }
}
