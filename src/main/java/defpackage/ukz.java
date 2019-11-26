package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ukz */
public final class ukz implements Parcelable {
    public static final Creator CREATOR = new ulc();
    public final Uri a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final long g;
    public final long[] h;
    public final int[] i;
    private final boolean j;
    private final int k;
    private final byte[] l;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        parcel.writeParcelable(this.a, 0);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeLong(this.g);
        parcel.writeLongArray(this.h);
        parcel.writeIntArray(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        if (this.l != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        byte[] bArr = this.l;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public final int a() {
        int i = this.f;
        return (i == 0 || i == 180) ? this.d : this.e;
    }

    public final int b() {
        int i = this.f;
        return (i == 0 || i == 180) ? this.e : this.d;
    }

    public final float c() {
        return ((float) a()) / ((float) b());
    }

    public final int d() {
        return this.h.length;
    }

    public final boolean a(int i) {
        uhy.a(i, this.h.length);
        int[] iArr = this.i;
        return iArr == null || Arrays.binarySearch(iArr, i) >= 0;
    }

    public final long b(int i) {
        uhy.a(i, this.h.length);
        return this.h[i];
    }

    private final int e(long j) {
        if (j >= 0) {
            long j2 = this.g;
            long[] jArr = this.h;
            if (j <= Math.max(j2 - 1, jArr[jArr.length - 1])) {
                int binarySearch = Arrays.binarySearch(this.h, j);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 2;
                }
                return binarySearch;
            }
        }
        return -1;
    }

    public final int a(long j) {
        if (j < 0) {
            return 0;
        }
        long[] jArr = this.h;
        if (j >= jArr[jArr.length - 1]) {
            return d() - 1;
        }
        return e(j);
    }

    public final int b(long j) {
        if (j < this.h[e(0)]) {
            return e(0);
        }
        int d = d(j);
        if (d != -1) {
            if (this.h[e(d)] == j) {
                return e(d);
            }
            if (d != e() - 1) {
                return e(d + 1);
            }
        }
        return -1;
    }

    public final int c(long j) {
        if (j > this.h[e(-1)]) {
            return e(-1);
        }
        int d = d(j);
        if (d != -1) {
            return e(d);
        }
        return -1;
    }

    public final int c(int i) {
        if (i < 0) {
            return -1;
        }
        if (i >= d()) {
            return e(-1);
        }
        return e(d(i));
    }

    public final String toString() {
        String name = getClass().getName();
        Object[] objArr = new Object[11];
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 7);
        stringBuilder.append("source=");
        stringBuilder.append(valueOf);
        objArr[0] = stringBuilder.toString();
        int i = this.c;
        StringBuilder stringBuilder2 = new StringBuilder(27);
        stringBuilder2.append("videoTrackIndex=");
        stringBuilder2.append(i);
        objArr[1] = stringBuilder2.toString();
        i = this.d;
        stringBuilder2 = new StringBuilder(17);
        stringBuilder2.append("width=");
        stringBuilder2.append(i);
        objArr[2] = stringBuilder2.toString();
        i = this.e;
        stringBuilder2 = new StringBuilder(18);
        stringBuilder2.append("height=");
        stringBuilder2.append(i);
        objArr[3] = stringBuilder2.toString();
        i = this.f;
        stringBuilder2 = new StringBuilder(27);
        stringBuilder2.append("rotationDegrees=");
        stringBuilder2.append(i);
        objArr[4] = stringBuilder2.toString();
        long j = this.g;
        stringBuilder = new StringBuilder(31);
        stringBuilder.append("durationUs=");
        stringBuilder.append(j);
        objArr[5] = stringBuilder.toString();
        i = this.h.length;
        stringBuilder2 = new StringBuilder(30);
        stringBuilder2.append("frameTimesUs count=");
        stringBuilder2.append(i);
        objArr[6] = stringBuilder2.toString();
        int[] iArr = this.i;
        Object obj = "null";
        valueOf = String.valueOf(iArr != null ? Integer.valueOf(iArr.length) : obj);
        StringBuilder stringBuilder3 = new StringBuilder(valueOf.length() + 25);
        stringBuilder3.append("syncSamplesIndices count=");
        stringBuilder3.append(valueOf);
        objArr[7] = stringBuilder3.toString();
        boolean z = this.j;
        stringBuilder = new StringBuilder(16);
        stringBuilder.append("hasBFrames=");
        stringBuilder.append(z);
        objArr[8] = stringBuilder.toString();
        i = this.k;
        stringBuilder = new StringBuilder(22);
        stringBuilder.append("stereoMode=");
        stringBuilder.append(i);
        objArr[9] = stringBuilder.toString();
        byte[] bArr = this.l;
        if (bArr != null) {
            obj = Integer.valueOf(bArr.length);
        }
        valueOf = String.valueOf(obj);
        stringBuilder = new StringBuilder(valueOf.length() + 21);
        stringBuilder.append("projectionData count=");
        stringBuilder.append(valueOf);
        objArr[10] = stringBuilder.toString();
        return uhv.a(name, objArr);
    }

    public final int d(long j) {
        int e = e(j);
        if (e != -1) {
            return d(e);
        }
        return -1;
    }

    public final int d(int i) {
        int[] iArr = this.i;
        if (iArr != null) {
            i = Arrays.binarySearch(iArr, i);
            if (i < 0) {
                i = (-i) - 2;
                boolean z = true;
                uhy.b(i >= 0);
                if (i >= this.i.length) {
                    z = false;
                }
                uhy.b(z);
            }
        }
        return i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukz)) {
            return false;
        }
        return uhv.a(this.a, ((ukz) obj).a);
    }

    public final int e() {
        int[] iArr = this.i;
        return iArr == null ? this.h.length : iArr.length;
    }

    public final int e(int i) {
        if (i < 0) {
            i += e();
        }
        int[] iArr = this.i;
        return iArr != null ? iArr[i] : i;
    }

    /* synthetic */ ukz(Parcel parcel) {
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        boolean z = false;
        this.b = parcel.readInt() != 0;
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readLong();
        this.h = parcel.createLongArray();
        this.i = parcel.createIntArray();
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.j = z;
        this.k = parcel.readInt();
        this.l = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    /* synthetic */ ukz(Uri uri, boolean z, int i, int i2, int i3, int i4, long j, long[] jArr, int[] iArr, boolean z2) {
        this.a = (Uri) uhy.a((Object) uri);
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
        if (i4 == 0 || i4 == 90 || i4 == 180 || i4 == 270) {
            this.f = i4;
            this.g = j;
            this.j = z2;
            this.k = 0;
            this.l = null;
            if (jArr == null || jArr.length <= 0) {
                throw new IOException("Could not parse any frame times from video");
            }
            int i5 = 1;
            i = 1;
            while (i < jArr.length) {
                if (jArr[i] > jArr[i - 1]) {
                    i++;
                } else {
                    throw new IOException("Frame times are not strictly ascending");
                }
            }
            this.h = jArr;
            if (iArr != null) {
                if (iArr.length <= 0 || iArr[0] < 0) {
                    throw new IOException("Could not parse sync samples from video");
                }
                while (i5 < iArr.length) {
                    int i6 = iArr[i5];
                    if (i6 <= iArr[i5 - 1]) {
                        throw new IOException("Sync samples are not strictly ascending");
                    } else if (i6 < jArr.length) {
                        i5++;
                    } else {
                        throw new IOException("Sync sample is not a valid frame");
                    }
                }
            }
            this.i = iArr;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(39);
        stringBuilder.append("Video rotation unsupported: ");
        stringBuilder.append(i4);
        throw new IOException(stringBuilder.toString());
    }
}
