package defpackage;

/* renamed from: aady */
public abstract class aady {
    public abstract aady a(aadq aadq);

    public abstract aady a(aadu aadu);

    public abstract aady a(String str);

    public abstract amqp a();

    public abstract aady b(aadq aadq);

    public abstract aady b(aadu aadu);

    public abstract amqp b();

    public abstract aadz c();

    public final aadz d() {
        if (!a().a()) {
            a(aadu.a);
        }
        if (!b().a()) {
            b(aadu.a);
        }
        aadz c = c();
        boolean z = false;
        boolean z2 = (c.b() == null && c.c() == null) ? false : true;
        amqw.b(z2, (Object) "Both current and previous entity cannot be null");
        if (!(c.b() == null || c.c() == null)) {
            amqw.b(c.b().getClass().equals(c.c().getClass()), (Object) "Both current and previous entity should be of the same Entity type");
            amqw.b(c.b().a().equals(c.c().a()), (Object) "Both previous and current entities must have the same key");
        }
        if ((c.b() != null && c.a().equals(c.b().a())) || (c.c() != null && c.a().equals(c.c().a()))) {
            z = true;
        }
        amqw.b(z, (Object) "The update's entityKey must match the current or previous entity's key (or both)");
        return c;
    }
}
