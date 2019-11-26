package defpackage;

/* renamed from: ynf */
final /* synthetic */ class ynf implements xsd {
    private final yng a;

    ynf(yng yng) {
        this.a = yng;
    }

    public final void a(Object obj) {
        yng yng = this.a;
        yko yko = (yko) obj;
        yng.m = yko;
        yma g = yng.h.g();
        yly yly = new yly();
        String str = yko.a;
        if (str != null) {
            yly.a = str;
            str = yko.getBodyKey();
            if (str != null) {
                yly.b = str;
                str = "";
                if (yly.a == null) {
                    str = str.concat(" chatEntityKey");
                }
                if (yly.b == null) {
                    str = String.valueOf(str).concat(" chatBodyEntityKey");
                }
                if (str.isEmpty()) {
                    yng.h = g.a(new ylv(yly.a, yly.b)).a();
                    if (yng.i == null) {
                        yng.i = yng.e.a(yko.getHeaderKey(), new yni(yng), false, yng.g);
                    }
                    if (yng.j == null) {
                        yng.j = yng.e.a(yko.getBodyKey(), new ynh(yng), false, yng.g);
                        return;
                    }
                    return;
                }
                String str2 = "Missing required properties:";
                throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
            }
            throw new NullPointerException("Null chatBodyEntityKey");
        }
        throw new NullPointerException("Null chatEntityKey");
    }
}
