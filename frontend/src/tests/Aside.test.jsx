import { render, fireEvent, screen } from "@testing-library/react";
import { Aside } from "../components/Aside/Aside";
import { expect } from "chai";

test('muestra el diálogo cuando se hace click en el botón', ()=>{
    render (<Aside/>);
    const button = screen.getByText('AÑADIR LIBRO');
    fireEvent.click(button);
    const dialog = screen.getByText('Header');
    expect(dialog).toBeInTheDocument();
})

 test('oculta el diálogo cuando se hace click fuera de él', ()=>{
    render(<Aside/>);
    const outsideContainer = screen.getByTestId('outside-container');
    fireEvent.click(outsideContainer);
    fireEvent.click(document.body);
    const dialog = screen.queryByText('Header');
    expect(dialog).not.toBeInTheDocument();
}) 