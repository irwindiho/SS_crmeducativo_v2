package com.consultoraestrategia.ss_crmeducativo.asistencia;

import android.support.design.widget.FloatingActionButton;

import com.consultoraestrategia.ss_crmeducativo.asistencia.events.AsistenciaEvent;
import com.consultoraestrategia.ss_crmeducativo.lib.EventBus;
import com.consultoraestrategia.ss_crmeducativo.lib.GreenRobotEventBus;


/**
 * Created by kelvi on 20/02/2017.
 */

public class AsistenciaPresenterImpl implements AsistenciaPresenter {
    private static final String TAG = "AsistenciaPresenterImpl";
    private EventBus eventBus;
    private AsistenciaInteractor asistenciaInteractor;
    private AsistenciaView asistenciaView;


    public AsistenciaPresenterImpl(AsistenciaView asistenciaView) {
        this.asistenciaView = asistenciaView;
        this.asistenciaInteractor = new AsistenciaInteractorImpl();
        eventBus = GreenRobotEventBus.getInstance();
    }

    @Override
    public void onCreate() {
        eventBus.register(this);
    }

    @Override
    public void onDestroy() {
        asistenciaView = null;
        eventBus.unRegister(this);
    }

    @Override
    public void onGetListaAlumnos() {
        if (asistenciaView != null) {

        }
        asistenciaInteractor.onGetListaAlumnos();
    }

    @Override
    public void initListView() {
        if (asistenciaView != null) {

        }
        asistenciaInteractor.onInitListView();
    }

    @Override
    public void changeStateFabButtons(FloatingActionButton btnCurrentState, FloatingActionButton btnAsistio, FloatingActionButton btnFalto, FloatingActionButton btnJustificado) {
        if (asistenciaView != null) {

        }
        asistenciaInteractor.changeStateFabButtons(btnCurrentState, btnAsistio, btnFalto, btnJustificado);
    }

    @Override
    public void OnEventMainThread(AsistenciaEvent asistenciaEvent) {
        switch (asistenciaEvent.getTypeEvent()) {
            case AsistenciaEvent.onGetListaAlumnosSuccess:
                onGetListaAlumnosSuccess();
                break;
            case AsistenciaEvent.onGetListaAlumnosError:
                onGetListaAlumnosError(asistenciaEvent.error);
                break;
            case AsistenciaEvent.onInitListViewSuccess:
                InitListViewSuccess();
                break;
            case AsistenciaEvent.onInitListViewError:
                onInitListViewError();
                break;
            case AsistenciaEvent.onChangeStateFabButtonsSuccess:
                onChangeStateFabButtonsSuccess();
                break;
            case AsistenciaEvent.onChangeStateFabButtonsError:
                onChangeStateFabButtonsError(asistenciaEvent.error);
                break;

        }
    }

    private void onChangeStateFabButtonsError(String error) {

    }

    private void onChangeStateFabButtonsSuccess() {

    }

    private void onInitListViewError() {

    }

    private void InitListViewSuccess() {

    }

    private void onGetListaAlumnosError(String error) {
    }

    private void onGetListaAlumnosSuccess() {
    }


}
