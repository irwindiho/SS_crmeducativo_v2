package com.consultoraestrategia.ss_crmeducativo.mainCursosAlumno;

import android.support.annotation.NonNull;
import android.util.Log;

import com.consultoraestrategia.ss_crmeducativo.mainCursosDocente.events.ListCursosEvent;
import com.consultoraestrategia.ss_crmeducativo.domain.FirebaseAuthHelper;
import com.consultoraestrategia.ss_crmeducativo.lib.EventBus;
import com.consultoraestrategia.ss_crmeducativo.lib.GreenRobotEventBus;
import com.google.firebase.auth.FirebaseAuth;


/**
 * Created by kelvi on 21/02/2017.
 */

public class MainCursosAlumnoRepositoryImpl implements MainCursosAlumnoRepository {


    private static final String TAG = "ListCursoRepositoryImpl";
    private boolean isLoadSuccess = false;

    private FirebaseAuthHelper firebaseAuthHelper;
    private FirebaseAuth firebaseAuth;

    public MainCursosAlumnoRepositoryImpl() {
//        this.firebaseAuthHelper = FirebaseAuthHelper.getInstace();
//        firebaseAuth = firebaseAuthHelper.getmAuth();

    }


    private void postEvent(int type, String error) {

        ListCursosEvent listCursosEvent = new ListCursosEvent();
        listCursosEvent.setTypeEvent(type);
        if (error != null) {
            listCursosEvent.setError(error);
        }

        EventBus eventBus = GreenRobotEventBus.getInstance();
        eventBus.post(listCursosEvent);
    }

    private void postEvent(int type) {
        postEvent(type, null);
    }

    @Override
    public void checkData() {
        firebaseAuth.addAuthStateListener(new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                postEvent(ListCursosEvent.loadSuccess);
                isLoadSuccess = true;
                Log.d(TAG, "onLoadSuccess");
//                if (firebaseAuth != null && firebaseAuth.getCurrentUser() != null) {
//                    if (!isLoadSuccess) {
//
//
//                    }
//
//                } else {
//                    postEvent(ListCursosEvent.failedToRecoverySession);
//                }
            }
        });
    }

    @Override
    public void loadSuccess() {
        postEvent(ListCursosEvent.loadSuccess);
    }

    @Override
    public void loadError() {
        postEvent(ListCursosEvent.loadError);
    }
}
