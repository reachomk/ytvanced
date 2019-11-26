package defpackage;

/* renamed from: acwb */
public class acwb {
    public acvx a = acvx.g;
    public byte[] b;
    public acwc c;

    public final void a(acvx acvx) {
        if (acvx == null) {
            xtl.c("Trying to set a null InteractionLogger!!  Assigning to no-op InteractionLogger instead");
            this.a = acvx.g;
            return;
        }
        this.a = acvx;
    }
}
