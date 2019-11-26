package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import java.util.Arrays;

/* renamed from: rvz */
public final class rvz extends qou implements Comparable {
    public static final Creator CREATOR = new rxp();
    public final String a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;

    public rvz(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.h = i2;
    }

    private static int a(int i, int i2) {
        return i < i2 ? -1 : i != i2 ? 1 : 0;
    }

    public final String toString() {
        return a(new StringBuilder());
    }

    public final String a(StringBuilder stringBuilder) {
        stringBuilder.append("Flag(");
        stringBuilder.append(this.a);
        String str = ", ";
        stringBuilder.append(str);
        int i = this.g;
        if (i == 1) {
            stringBuilder.append(this.b);
        } else if (i == 2) {
            stringBuilder.append(this.c);
        } else if (i != 3) {
            String str2 = "'";
            if (i == 4) {
                stringBuilder.append(str2);
                stringBuilder.append(this.e);
                stringBuilder.append(str2);
            } else if (i != 5) {
                String str3 = this.a;
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str3).length() + 27);
                stringBuilder2.append("Invalid type: ");
                stringBuilder2.append(str3);
                stringBuilder2.append(str);
                stringBuilder2.append(i);
                throw new AssertionError(stringBuilder2.toString());
            } else if (this.f == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(str2);
                stringBuilder.append(Base64.encodeToString(this.f, 3));
                stringBuilder.append(str2);
            }
        } else {
            stringBuilder.append(this.d);
        }
        stringBuilder.append(str);
        stringBuilder.append(this.g);
        stringBuilder.append(str);
        stringBuilder.append(this.h);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rvz) {
            rvz rvz = (rvz) obj;
            if (rwh.a(this.a, rvz.a)) {
                int i = this.g;
                if (i == rvz.g && this.h == rvz.h) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    return rwh.a(this.e, rvz.e);
                                }
                                if (i == 5) {
                                    return Arrays.equals(this.f, rvz.f);
                                }
                                StringBuilder stringBuilder = new StringBuilder(31);
                                stringBuilder.append("Invalid enum value: ");
                                stringBuilder.append(i);
                                throw new AssertionError(stringBuilder.toString());
                            } else if (this.d != rvz.d) {
                                return false;
                            } else {
                                return true;
                            }
                        } else if (this.c != rvz.c) {
                            return false;
                        } else {
                            return true;
                        }
                    } else if (this.b != rvz.b) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, 5, this.d);
        qov.a(parcel, 6, this.e);
        qov.a(parcel, 7, this.f);
        qov.b(parcel, 8, this.g);
        qov.b(parcel, 9, this.h);
        qov.a(parcel, i);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        rvz rvz = (rvz) obj;
        int compareTo = this.a.compareTo(rvz.a);
        int i = 0;
        if (compareTo == 0) {
            compareTo = rvz.a(this.g, rvz.g);
            if (compareTo == 0) {
                compareTo = this.g;
                if (compareTo != 1) {
                    if (compareTo == 2) {
                        boolean z = this.c;
                        if (z != rvz.c) {
                            if (z) {
                                return 1;
                            }
                            compareTo = -1;
                        }
                    } else if (compareTo == 3) {
                        compareTo = Double.compare(this.d, rvz.d);
                    } else if (compareTo == 4) {
                        String str = this.e;
                        String str2 = rvz.e;
                        if (str != str2) {
                            if (str != null) {
                                if (str2 != null) {
                                    return str.compareTo(str2);
                                }
                            }
                            compareTo = -1;
                        }
                    } else if (compareTo == 5) {
                        byte[] bArr = this.f;
                        byte[] bArr2 = rvz.f;
                        if (bArr != bArr2) {
                            if (bArr != null) {
                                if (bArr2 != null) {
                                    while (i < Math.min(this.f.length, rvz.f.length)) {
                                        compareTo = this.f[i] - rvz.f[i];
                                        if (compareTo != 0) {
                                            break;
                                        }
                                        i++;
                                    }
                                    compareTo = rvz.a(this.f.length, rvz.f.length);
                                }
                            }
                            compareTo = -1;
                        }
                    } else {
                        StringBuilder stringBuilder = new StringBuilder(31);
                        stringBuilder.append("Invalid enum value: ");
                        stringBuilder.append(compareTo);
                        throw new AssertionError(stringBuilder.toString());
                    }
                    compareTo = 0;
                } else {
                    long j = this.b;
                    long j2 = rvz.b;
                    if (j >= j2) {
                        if (j == j2) {
                            return 0;
                        }
                    }
                    compareTo = -1;
                }
                compareTo = 1;
            }
        }
        return compareTo;
    }

    static {
        rxm rxm = new rxm();
    }
}
