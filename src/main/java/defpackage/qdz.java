package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: qdz */
public final class qdz extends qou {
    public static final Creator CREATOR = new qeq();
    public File a;
    private ParcelFileDescriptor b;
    private final String c;
    private final String d;

    qdz(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.b = parcelFileDescriptor;
        this.c = str;
        this.d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            File file = this.a;
            if (file != null) {
                try {
                    file = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        this.b = ParcelFileDescriptor.open(file, 268435456);
                        file.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                        byte[] bArr = null;
                        try {
                            dataOutputStream.writeInt(bArr.length);
                            dataOutputStream.writeUTF(this.c);
                            dataOutputStream.writeUTF(this.d);
                            dataOutputStream.write(bArr);
                            qdz.a(dataOutputStream);
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not write into unlinked file", e);
                        } catch (Throwable th) {
                            qdz.a(dataOutputStream);
                        }
                    } catch (FileNotFoundException unused) {
                        throw new IllegalStateException("Temporary file is somehow already deleted.");
                    }
                } catch (IOException e2) {
                    throw new IllegalStateException("Could not create temporary file:", e2);
                }
            }
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
        }
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.b, i);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, 4, this.d);
        qov.a(parcel, a);
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }
}
