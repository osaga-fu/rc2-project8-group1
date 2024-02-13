import { render,fireEvent,screen } from '@testing-library/react';
import {Searchbar} from '../components/Searchbar';

test('no hay texto en la barra de búsqueda', ()=>{
    render(<Searchbar/>)


const inputElement = screen.getPlaceholderText('');
fireEvent.change(inputElement, {target: {value: 'search term'}});
expect("");
});