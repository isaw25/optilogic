package ol.com.fridgey;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AccelerometerService extends Service {
    public AccelerometerService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
