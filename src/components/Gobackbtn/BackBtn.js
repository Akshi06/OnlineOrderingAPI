import React from 'react';
import { useHistory } from 'react-router-dom';
import "./backBtn.css"

function BackBtn() {
    const history = useHistory();
    return (
        <div className="back">
            <button onClick={() => history.goBack()} className="btnGo backBtn"><span><span>Go back </span></span></button>
        </div>
    );
}

export default BackBtn;