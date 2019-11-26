package defpackage;

import android.content.Context;

/* renamed from: suh */
public final class suh implements syi {
    public static final byte[] a = new byte[0];
    private static final aztm f;
    private static final aztm g;
    public final stw b = new stw(suk.a);
    public final Context c;
    public final boolean d;
    public final boolean e;

    public suh(Context context, amqp amqp, amqp amqp2) {
        this.c = context;
        Object valueOf = Boolean.valueOf(false);
        this.d = ((Boolean) amqp.a(valueOf)).booleanValue();
        this.e = ((Boolean) amqp2.a(valueOf)).booleanValue();
    }

    public final syh a(byte[] bArr, bapc bapc) {
        return new suj(this, bArr, bapc);
    }

    static byte[] a(Context context, sxq sxq) {
        try {
            if (!sxq.c) {
                return sxq.b;
            }
            aztm aztm;
            aztk aztk = (aztk) aztl.b.createBuilder((aztl) anxl.parseFrom(aztl.b, sts.a(sxq).a));
            String str = "/system/orientation";
            if (context.getResources().getConfiguration().orientation != 2) {
                aztm = g;
            } else {
                aztm = f;
            }
            aztk.a(str, aztm);
            aztg aztg = (aztg) azth.a.createBuilder();
            aztg.a(aztl.c, (aztl) ((anxl) aztk.build()));
            return ((azth) ((anxl) aztg.build())).toByteArray();
        } catch (anyg e) {
            throw new sxf("Failed to deserialize Model", e);
        }
    }

    static {
        aztp aztp = (aztp) aztm.c.createBuilder();
        aztp.a(0);
        f = (aztm) ((anxl) aztp.build());
        aztp = (aztp) aztm.c.createBuilder();
        aztp.a(1);
        g = (aztm) ((anxl) aztp.build());
    }
}
