package defpackage;

import java.io.CharArrayWriter;

/* renamed from: adaj */
public final class adaj {
    private static final String b = adaj.class.getCanonicalName();
    public adai a;
    private int c;
    private final CharArrayWriter d = new CharArrayWriter();
    private final CharArrayWriter e = new CharArrayWriter();
    private int f = 1;

    adaj() {
    }

    public static void a(int i) {
        if (i == 404) {
            throw new adbg("Unexpected response code: 404");
        } else if (i != 200) {
            throw new adbi(i);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        if (this.f == 2) {
            xtl.b(b, "Lost partial chunk");
        }
    }

    public final int a(char[] cArr) {
        int length = cArr.length;
        int i = length;
        int i2 = 0;
        while (i != 0) {
            int i3 = this.f;
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == 0) {
                    for (i4 = 0; i4 < i; i4++) {
                        if (cArr[i2 + i4] == 10) {
                            this.d.write(cArr, i2, i4);
                            String charArrayWriter = this.d.toString();
                            try {
                                this.c = Integer.parseInt(charArrayWriter, 10);
                                this.f = 2;
                                this.d.reset();
                            } catch (NumberFormatException e) {
                                String str = b;
                                charArrayWriter = String.valueOf(charArrayWriter);
                                String str2 = "Error parsing chunk length: ";
                                if (charArrayWriter.length() == 0) {
                                    charArrayWriter = new String(str2);
                                } else {
                                    charArrayWriter = str2.concat(charArrayWriter);
                                }
                                xtl.a(str, charArrayWriter, e);
                                this.f = 1;
                                this.d.reset();
                            }
                            i3 = i4 + 1;
                            break;
                        }
                    }
                    this.d.write(cArr, i2, i);
                } else if (i4 == 1) {
                    i4 = this.c;
                    if (i >= i4) {
                        this.f = 1;
                    } else {
                        i4 = i;
                    }
                    this.e.write(cArr, i2, i4);
                    i3 = this.c - i4;
                    this.c = i3;
                    if (i3 == 0) {
                        adai adai = this.a;
                        if (adai != null) {
                            adai.a(this.e.toString());
                        }
                        this.e.reset();
                    }
                    i3 = i4;
                    i2 += i3;
                    i -= i3;
                }
                i3 = i;
                i2 += i3;
                i -= i3;
            } else {
                throw null;
            }
        }
        return length;
    }
}
