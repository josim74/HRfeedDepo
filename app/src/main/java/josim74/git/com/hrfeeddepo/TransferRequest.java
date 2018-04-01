package josim74.git.com.hrfeeddepo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class TransferRequest extends Fragment {

    private ImageButton imageButtonGoTransferDetails;
    private View mview;

    public TransferRequest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mview =  inflater.inflate(R.layout.fragment_transfer_request, container, false);
        imageButtonGoTransferDetails = mview.findViewById(R.id.imgbtn_go_transfer_details_TransferRequest);

        imageButtonGoTransferDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent transferDetailsIntent = new Intent(getActivity(), TransferDetailsActivity.class);
                startActivity(transferDetailsIntent);
            }
        });
        return mview;
    }

}
