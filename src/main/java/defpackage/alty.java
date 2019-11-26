package defpackage;

import java.io.IOException;

/* renamed from: alty */
final /* synthetic */ class alty implements amqd {
    private final altm a;
    private final alvd b;

    alty(altm altm, alvd alvd) {
        this.a = altm;
        this.b = alvd;
    }

    public final Object a(Object obj) {
        String valueOf;
        altm altm = this.a;
        alvd alvd = this.b;
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            try {
                return alvd.a(bArr);
            } catch (IOException e) {
                valueOf = String.valueOf(altm);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 51);
                stringBuilder.append("An error occurred while unmarshalling the value for");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString(), e);
            }
        }
        valueOf = String.valueOf(altm);
        StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 30);
        stringBuilder2.append("Could not find any value for: ");
        stringBuilder2.append(valueOf);
        throw new alto(stringBuilder2.toString());
    }
}
